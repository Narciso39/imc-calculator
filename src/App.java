public class App {
    public static void main(String[] args) throws Exception {

    Celular celularA = new Celular();

    celularA.nome = "Iphone 12";
    celularA.tamanhoTela =  6.1f;
    celularA.armazenamento = 256;
    celularA.sistemaOperacional = "Ios";

    Celular celularB = new Celular(); 

    celularB.nome = "S23 Ultra";
    celularB.tamanhoTela =  6.8f;
    celularB.armazenamento = 256;
    celularB.sistemaOperacional = "android";
    
    Celular celularC;

    celularC = new Celular();

    
    celularC.nome = "Xiaomi";
    celularC.tamanhoTela =  5.8f;
    celularC.armazenamento = 1;
    celularC.sistemaOperacional = "android";

    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n",  celularA.nome, celularA.tamanhoTela,  celularA.armazenamento,celularA.sistemaOperacional );

    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional);
    
    System.out.format("Celular %s com tela de %.1f, com %dtb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.armazenamento, celularC.sistemaOperacional);
}
    
}
