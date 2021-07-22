


interface Wheel {
    rotate: () => number
}


class MRFWheel implements Wheel {
    rotate() {
        console.log("MRF wheel rptating");
        return 123;
    }
}

class CEATWheel implements Wheel {
    rotate() {
        console.log("CEAT wheel rptating");
        return 123;
    }
}


class Car {

    private wheel: Wheel;

    constructor(wheel: Wheel) {
        this.wheel = wheel
    }

    move() {
        this.wheel.rotate();
        console.log("Car moving");
    }
}



// const wheel:Wheel=new MRFWheel();
// const car:Car=new Car(wheel);


const wheel = {
    rotate() {
        console.log("some wheel rotating");
        return 123
    }
};
const car = new Car(wheel)
car.move()