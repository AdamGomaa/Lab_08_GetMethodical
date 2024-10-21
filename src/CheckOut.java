public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double itemPrice = 0;
    boolean keepShopping = true;
    double totalPrice = 0;

    while (keepShopping) {

        itemPrice = SafeInput.getRangedDouble(in, "Enter price of item (max $10.00): ", 0, 10);
        totalPrice += itemPrice;

        keepShopping = SafeInput.getYNConfirm(in, "do you have more items?(Y/N): ");

    }

    System.out.printf("Your cart total is %.2f%n", totalPrice);


}