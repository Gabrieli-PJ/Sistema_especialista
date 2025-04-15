package util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Theme {

    /**
     * Aplica o tema Nimbus à aplicação, garantindo uma experiência visual moderna e responsiva.
     */
    public static void setNimbusTheme() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.err.println("Erro ao definir tema Nimbus: " + ex.getMessage());
        }
    }
    
    /**
     * Placeholder para salvar a preferência do tema.
     * Este método pode ser expandido para registrar as preferências do usuário em um arquivo ou sistema de persistência.
     *
     * @param theme Nome do tema escolhido pelo usuário
     */
    public static void saveThemePreference(String theme) {
        // Exemplo de log para simulação de salvamento da preferência
        System.out.println("Tema '" + theme + "' salvo com sucesso!");
    }
}
