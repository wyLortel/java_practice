package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("더 이상 아이템을 추가할수 없습니다");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + "합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + sum);

    }



}
