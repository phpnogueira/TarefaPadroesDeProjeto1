interface Motor {
    String tipo();
}

interface Chassi {
    String tipo();
}

interface Pneu {
    String tipo();
}

class MotorEsportivo implements Motor {
    @Override
    public String tipo() {
        return "Motor Esportivo";
    }
}

class MotorFamiliar implements Motor {
    @Override
    public String tipo() {
        return "Motor Familiar";
    }
}

// Chassis
class ChassiEsportivo implements Chassi {
    @Override
    public String tipo() {
        return "Chassi Esportivo";
    }
}

class ChassiFamiliar implements Chassi {
    @Override
    public String tipo() {
        return "Chassi Familiar";
    }
}

// Pneus
class PneuEsportivo implements Pneu {
    @Override
    public String tipo() {
        return "Pneu Esportivo";
    }
}

class PneuFamiliar implements Pneu {
    @Override
    public String tipo() {
        return "Pneu Familiar";
    }
}