package week3.day2;

public class Elements extends Button {
		/*
		 * Create execution class named , also inheriting from the Button subclass.
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- WebElement Example ----");
        WebElements element = new WebElements();
        element.click();
        element.setText("Generic Element");

        System.out.println("\n---- Button Example ----");
        Button button = new Button();
        button.click();
        button.submit();

        System.out.println("\n---- TextField Example ----");
        TextField field = new TextField();
        field.getText();

        System.out.println("\n---- CheckBoxButton Example ----");
        CheckBoxButton checkBox = new CheckBoxButton();
        checkBox.click();
        checkBox.clickCheckButton();
        checkBox.submit();

        System.out.println("\n---- RadioButton Example ----");
        RadioButton radio = new RadioButton();
        radio.click();
        radio.selectRadioButton();

        System.out.println("\n---- Elements Class Example ----");
        Elements elementObj = new Elements();
        elementObj.click();
        elementObj.submit();

	}

}
