package bachtiar.firdaus.belajar_spring_redis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@KeySpace("products")
public class Product implements Serializable {

    @Id
    private String id;

    private String name;

    private Long price;

    @TimeToLive(unit = TimeUnit.SECONDS)
    @Builder.Default // 🛠️ TAMBAHKAN INI agar Lombok Builder membaca nilai default -1L
    private Long ttl = -1L;
}