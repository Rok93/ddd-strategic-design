package kitchenpos.external.deliveryagency;

import java.math.BigDecimal;
import java.util.UUID;

public interface DeliveryAgencyClient {

    void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress);
}
