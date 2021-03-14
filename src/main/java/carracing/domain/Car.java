package carracing.domain;

import carracing.service.dto.RacingScore;

import java.util.Random;

/**
 * Car
 * version 0.0.2
 * 
 * history
 *  0.0.1) 클래스 신규생성
 *  0.0.2) Engine 클래스 멤버필드 추가, drive 로직 수정
 */
public class Car {

    private final Engine engine = new Engine(new Random());

    private int mileage;

    public void drive() {
        mileage+=engine.drive();
    }

    public RacingScore inquiryRacingScore() {
        return new RacingScore(mileage);
    }
}