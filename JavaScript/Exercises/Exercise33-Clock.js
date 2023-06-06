/*

Requirement: Make a clock that show in real time the hour every second
             You only can use date object to get time at the first time

Test Cases:
    let clock = new Clock();
    clock.start();

    Output:
        14:20:16
        14:20:17
        14:20:18

Steps:
    - create a class
    - init properties with current time
    - use setInterval
    - add method to show time
    - add method to add seconds, minutes, hours

*/

class Clock {

    constructor() {
        this.date = new Date();
        this.hours = this.date.getHours();
        this.minutes = this.date.getMinutes();
        this.seconds = this.date.getSeconds();
    }

    update(seconds) {
        this.seconds += seconds;

        if (this.seconds >= 60) {
            this.minutes++;
            this.seconds = 0;
        }

        if (this.minutes >= 60) {
            this.hours++;
            this.minutes = 0;
        }

        if (this.hours >= 24) {
            this.hours = 0;
        }

    }

    show() {
        this.update(1);
        console.log(`${this.hours}:${this.minutes}:${this.seconds}`)
    }

    start() {
        setInterval(() => {

            this.show();

        }, 1000);
    }

}

const clock = new Clock();
clock.start();
