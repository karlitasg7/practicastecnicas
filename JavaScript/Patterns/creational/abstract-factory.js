class MastodonCar {
    useGPS() {
        throw new Error("Method not implemented!!");
    }
}

class RhinoCar {
    useGPS() {
        throw new Error("Method not implemented!!");
    }
}

class MastodonSedanCar extends MastodonCar {
    useGPS() {
        console.log("[SEDAN] Mastodon GPS")
    }
}

class MastodonHatchbackCar extends MastodonCar {
    useGPS() {
        console.log("[HATCHBACK] Mastodon GPS")
    }
}

class RhinoSedanCar extends RhinoCar {
    useGPS() {
        console.log("[SEDAN] Rhino GPS")
    }
}

class RhinoHatchbackCar extends RhinoCar {
    useGPS() {
        console.log("[HATCHBACK] Rhino GPS")
    }
}

class CarAbstractFactory {
    createMastodon() {
        throw new Error("Method not implemented!!");
    }

    createRhino() {
        throw new Error("Method not implemented!!");
    }
}

class SedanCarFactory {
    createMastodon() {
        return new MastodonSedanCar();
    }

    createRhino() {
        return new RhinoSedanCar();
    }

}


class HatchbackCarFactory {
    createMastodon() {
        return new MastodonHatchbackCar();
    }

    createRhino() {
        return new RhinoHatchbackCar();
    }

}

function appCarFactory(factory) {
    const mastodon = factory.createMastodon();
    const rhino = factory.createRhino();

    mastodon.useGPS();
    rhino.useGPS();
}

appCarFactory(new HatchbackCarFactory());
appCarFactory(new SedanCarFactory());
