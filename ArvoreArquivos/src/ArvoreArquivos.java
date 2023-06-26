import java.io.File;

public class ArvoreArquivos {
    public static void main(String[] args) {
        String diretorio = "C:/Program Files";
        imprimeArvoreArquivos(diretorio);
    }

    public static void imprimeArvoreArquivos(String diretorio) {
        File file = new File(diretorio);
        imprimeArvoreArquivosRecursivo(file, "");
    }

    private static void imprimeArvoreArquivosRecursivo(File file, String espaco) {
        System.out.println(espaco + file.getName());

        if (file.isDirectory()) {
            File[] arquivos = file.listFiles();
            if (arquivos != null) {
                for (File arquivo : arquivos) {
                    imprimeArvoreArquivosRecursivo(arquivo, espaco + "---");
                }
            }
        }
    }
}
