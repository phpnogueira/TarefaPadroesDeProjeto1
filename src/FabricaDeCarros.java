public class FabricaDeCarros {

    public static void main(String[] args) {
        // Criando uma fábrica de carros esportivos
        CarroFactory fabricaEsportiva = new CarroEsportivoFactory();

        // Criando um carro esportivo
        var motorEsportivo = fabricaEsportiva.criarMotor();
        var chassiEsportivo = fabricaEsportiva.criarChassi();
        var pneuEsportivo = fabricaEsportiva.criarPneu();

        System.out.println("Carro Esportivo criado:");
        System.out.println("Motor: " + motorEsportivo.tipo());
        System.out.println("Chassi: " + chassiEsportivo.tipo());
        System.out.println("Pneu: " + pneuEsportivo.tipo());

        System.out.println();

        // Criando uma fábrica de carros familiares
        CarroFactory fabricaFamiliar = new CarroFamiliarFactory();

        // Criando um carro familiar
        var motorFamiliar = fabricaFamiliar.criarMotor();
        var chassiFamiliar = fabricaFamiliar.criarChassi();
        var pneuFamiliar = fabricaFamiliar.criarPneu();

        System.out.println("Carro Familiar criado:");
        System.out.println("Motor: " + motorFamiliar.tipo());
        System.out.println("Chassi: " + chassiFamiliar.tipo());
        System.out.println("Pneu: " + pneuFamiliar.tipo());
    }
}