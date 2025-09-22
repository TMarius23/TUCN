import javax.swing.*;

public class ConvertorMVC {

    public static void main(String[] args) {

        ConvModel model = new ConvModel();
        ConvView view = new ConvView(model);
        ConvController controller = new ConvController(model, view);

        view.setVisible(true);
    }
}
