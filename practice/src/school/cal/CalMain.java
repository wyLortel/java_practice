package school.cal;

public class CalMain {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CalLogic logic = new CalLogic();
            CalUi ui = new CalUi(logic);
            ui.showUI();
        });
    }
}

