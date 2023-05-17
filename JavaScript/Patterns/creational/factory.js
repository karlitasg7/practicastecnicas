class BaseCar {
    showCost() {
        throw new Error("Method not implemented!"); // it's used to work as an abstract method
    }
}

class MastodonCar extends BaseCar {
    showCost() {
        console.log('Mastodon Car Cost: 10,000 USD')
    }
}

class RhinoCar extends BaseCar {
    showCost() {
        console.log('Rhino Car Cost: 20,000 USD')
    }
}

class CarFactory {
    makeCar() {
        throw new Error("Method not implemented!");
    }
}

class MastodonCarFactory extends CarFactory {
    makeCar() {
        return new MastodonCar();
    }
}

class RhinoCarFactory extends CarFactory {
    makeCar() {
        return new RhinoCar();
    }
}

function appFactory(factory) {
    const car = factory.makeCar();
    car.showCost();
}

appFactory(new MastodonCarFactory());
appFactory(new RhinoCarFactory());

console.log(".....>>>>> with factories creator <<<<<.....");

// factories creator
function createFactory(type) {
    const factories = {
        mastodon: MastodonCarFactory,
        rhino: RhinoCarFactory,
    };

    const factory = factories[type];
    return new factory();
}

appFactory(createFactory('mastodon'));
appFactory(createFactory('rhino'));
