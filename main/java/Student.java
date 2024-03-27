import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.With;

@Builder
@With
public record Student(
        String id,
        String name,
        String subject
) {
}
