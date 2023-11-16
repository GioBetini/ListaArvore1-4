import arvoreInt.ArvoreInt;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        int[] vet = {7, 8, 3, 4, 2, 1, 6, 5};
        ArvoreInt arvore = new ArvoreInt();

        for(int i : vet){
            arvore.insert(i);
        }
        try{
        arvore.remove(7);
        arvore.remove(6);
        System.out.println("Atravessamento pré-ordem");
        arvore.prefixSearch();
        System.out.println("==================================================");
        System.out.println("Atravessamento em ordem");
        arvore.infixSearch();
        System.out.println("==================================================");
        System.out.println("Atravessamento pós-ordem");
        arvore.postfixSearch();
        System.out.println("==================================================");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
