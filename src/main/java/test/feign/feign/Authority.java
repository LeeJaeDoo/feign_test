package test.feign.feign;

import lombok.Getter;

@Getter
public enum Authority {
    OWNER("OWNER", 1),
    ADMIN("ADMIN", 2),
    NORMAL("NORMAL", 3);

    private String value;
    private int priority;

    Authority(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}
