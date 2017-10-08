package chapter14.quiz;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Car {
    int gasolineGauge;

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
}

class HybridCar extends Car {
    int electricGauge;

    public HybridCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }
}

class HybridWaterCar extends HybridCar {
    int waterGauge;

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 : " + this.gasolineGauge);
        System.out.println("잔여 전기량 : " + this.electricGauge);
        System.out.println("잔여 워터량 : " + this.waterGauge);
    }
}

public class ConstructorAndSuper {
    public static void main(String[] args) {
        HybridWaterCar hybridWaterCar = new HybridWaterCar(100, 90, 80);
        hybridWaterCar.showCurrentGauge();

        HybridWaterCar hybridWaterCar2 = new HybridWaterCar(1100, 190, 180);
        hybridWaterCar2.showCurrentGauge();
    }
}
