package chapter11._06_extract_subclass.practice;

/**
 * Extract Subclass (하위 클래스 추출)
 * <p>
 * 일부 인스턴스에만 사용되는 기능이 든 클래스가 있을 땐
 * - 그 기능 부분을 전담하는 하위클래스를 작성하자
 */
public class JobItem {
    private int unitPrice;
    private int quantity;

    protected JobItem(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    protected boolean isLabor() {
        return false;
    }
}
