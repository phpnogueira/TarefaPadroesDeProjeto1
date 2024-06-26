class CarroEsportivoFactory implements CarroFactory {
    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Chassi criarChassi() {
        return new ChassiEsportivo();
    }

    @Override
    public Pneu criarPneu() {
        return new PneuEsportivo();
    }
}


class CarroFamiliarFactory implements CarroFactory {
    @Override
    public Motor criarMotor() {
        return new MotorFamiliar();
    }

    @Override
    public Chassi criarChassi() {
        return new ChassiFamiliar();
    }

    @Override
    public Pneu criarPneu() {
        return new PneuFamiliar();
    }
}