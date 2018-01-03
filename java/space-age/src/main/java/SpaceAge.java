class SpaceAge {

    double _ageInSeconds;

    SpaceAge(double seconds) {
        this._ageInSeconds = new Double( seconds );
    }

    double getSeconds() {
        return this._ageInSeconds;
    }

    double onEarth() {
        return ( this._ageInSeconds / 31557600 );
    }

    double onMercury() {
        return ( this.onEarth() / 0.2408467 );
    }

    double onVenus() {
        return ( this.onEarth() / 0.61519726 );
    }

    double onMars() {
        return ( this.onEarth() / 1.8808158 );
    }

    double onJupiter() {
        return ( this.onEarth() / 11.862615 );
    }

    double onSaturn() {
        return ( this.onEarth() / 29.447498 );
    }

    double onUranus() {
        return ( this.onEarth() / 84.016846 );
    }

    double onNeptune() {
        return ( this.onEarth() / 164.79132 );
    }

}
