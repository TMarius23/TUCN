import java.awt.event.*;

public class CalcController {
    private CalcModel m_model;
    private CalcView  m_view;


    CalcController(CalcModel model, CalcView view) {
        m_model = model;
        m_view  = view;

        view.addMultiplyListener(new MultiplyListener());
        view.addAddListener(new AddListener());
        view.addClearListener(new ClearListener());
    }


    ////////////////////////////////////////// inner class MultiplyListener
    /** When a mulitplication is requested.
     *  1. Get the user input number from the View.
     *  2. Call the model to mulitply by this number.
     *  3. Get the result from the Model.
     *  4. Tell the View to display the result.
     * If there was an error, tell the View to display it.
     */
    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = m_view.getUserInput();
                m_model.multiplyBy(userInput);
                m_view.setTotal(m_model.getValue());

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput + "'");
            }
        }
    }

    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try{
                userInput = m_view.getUserInput();
                m_model.add(userInput);
                m_view.setTotal(m_model.getValue());

            }catch(NumberFormatException nfe){
                m_view.showError("Bad input: '" + userInput + "'");
            }
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_view.reset();
        }
    }
}
