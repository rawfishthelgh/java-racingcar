package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private final Cars cars;
    private final int round;

    public Competition(int unit, int round) {
        cars = new Cars(unit);
        this.round = round;
    }

    public Cars progressEntireRoundAndRecordLastSnapshot(Movable movable) {
        for (int i = 0; i < round; i++) {
            progressEachRound(movable);
        }
        return cars;
    }

    public List<Cars> progressEntireRoundAndRecordAllSnapshot(Movable movable) {
        List<Cars> snapshots = new ArrayList<>(round);
        for (int i = 0; i < round; i++) {
            snapshots.add(i, progressEachRound(movable));
        }
        return snapshots;
    }

    private Cars progressEachRound(Movable movable) {
        return cars.move(movable);
    }
}