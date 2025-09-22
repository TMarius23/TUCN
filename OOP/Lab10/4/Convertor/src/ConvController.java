import java.awt.event.*;
import java.math.BigDecimal;

public class ConvController {

    private final ConvModel model;
    private final ConvView view;

    public ConvController(ConvModel model, ConvView view) {
        this.model = model;
        this.view = view;

        view.addConvertListener(new CalcListener());
    }

    class CalcListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                BigDecimal userInput = new BigDecimal(view.getUserInput());

                int fromCurrency = view.getSelectedItem_1();
                int toCurrency = view.getSelectedItem_2();

                if (fromCurrency == toCurrency) {
                    model.multiply(userInput, BigDecimal.ONE);
                } else if (fromCurrency == 0 && toCurrency == 1) {
                    model.divide(userInput, model.getRonToEur());
                } else if (fromCurrency == 0 && toCurrency == 2) {
                    model.divide(userInput, model.getRonToUsd());
                } else if (fromCurrency == 1 && toCurrency == 2) {
                    model.multiply(userInput, model.getEurToUsd());
                } else if (fromCurrency == 2 && toCurrency == 1) {
                    model.divide(userInput, model.getEurToUsd());
                } else if (fromCurrency == 2 && toCurrency == 0) {
                    model.multiply(userInput, model.getRonToUsd());
                } else if (fromCurrency == 1 && toCurrency == 0) {
                    model.multiply(userInput, model.getRonToEur());
                } else {
                    throw new IllegalArgumentException("Conversie invalidă.");
                }

                BigDecimal result = model.getSum();
                view.setTextFiel_out(result.toString());

            } catch (NumberFormatException ex) {
                view.showError("Input invalid: te rugăm să introduci un număr valid.");
            } catch (Exception ex) {
                view.showError("Eroare: " + ex.getMessage());
            }
        }
    }
}
