
public class MainCarro {

    public static void main(String[] args) {
    
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.setCor("Azul");
        carro1.setModelo("Taus");
        carro1.setTanque(60);

        carro2.setCor("Preto");
        carro2.setModelo("Classe A");
        carro2.setTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.calculaTanque());

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getTanque());
        System.out.println(carro2.calculaTanque());

    }
    
}
