package hello.springmvc.itemService.domain.item;

import lombok.Data;

@Data // 핵심 도메인 모델에서 사용하기엔 위험하지만 지금은 공부중이라 사용함
// 필요한 어노테이션만 추가해주는게 좋음
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
