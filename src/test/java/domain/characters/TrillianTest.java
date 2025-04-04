package domain.characters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrillianTest {
    @Test
    void shouldRespondToStatusChanges() {
        Trillian trillian = new Trillian();
        assertDoesNotThrow(() -> trillian.onStatusChange("Test status"));
    }

    @Test
    void shouldAnalyzeReadings() {
        Trillian trillian = new Trillian();
        assertDoesNotThrow(trillian::analyzeReadings);
    }
}