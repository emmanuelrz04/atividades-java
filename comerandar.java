package orientada;

public class comerandar {
    String acao = " ";

    public void comer() {
        if (acao.equals(" ")) {
            acao = "comendo";
            System.out.println("A pessoa está comendo.");
        } else {
            System.out.println("A pessoa não pode comer enquanto está " + acao + ".");
        }
    }

    public void andar() {
        if (acao.equals(" ")) {
            acao = "andando";
            System.out.println("A pessoa está andando.");
        } else {
            System.out.println("A pessoa não pode andar enquanto está " + acao + ".");
        }
    }

    public void dormir() {
        if (acao.equals(" ")) {
            acao = "dormindo";
            System.out.println("A pessoa está dormindo.");
        } else {
            System.out.println("A pessoa não pode dormir enquanto está " + acao + ".");
        }
    }

 
    public void pararComer() {
        if (acao.equals("comendo")) {
            acao = " ";
            System.out.println("A pessoa parou de comer.");
        } else {
            System.out.println("A pessoa não está comendo.");
        }
    }

    public void pararAndar() {
        if (acao.equals("andando")) {
            acao = " ";
            System.out.println("A pessoa parou de andar.");
        } else {
            System.out.println("A pessoa não está andando.");
        }
    }

    public void pararDormir() {
        if (acao.equals("dormindo")) {
            acao = " ";
            System.out.println("A pessoa parou de dormir.");
        } else {
            System.out.println("A pessoa não está dormindo.");
        }
    }
}
