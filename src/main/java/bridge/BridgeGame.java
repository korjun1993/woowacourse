package bridge;

import bridge.position.Latitude;
import bridge.position.Position;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final List<String> bridge;
    private final Player player;
    private final Judge judge;

    public BridgeGame(List<String> bridge) {
        this.bridge = bridge;
        this.player = new Player();
        this.judge = new Judge(bridge);
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(Latitude latitude) {
        Position playerPosition = player.move(latitude);
        boolean safe = judge.isPlayerSafe(playerPosition);
        if (!safe) {
            player.death();
        }
        return safe;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        player.retry();
    }

    public boolean isProcessing() {
        return player.isAlive() && !judge.isPlayerWin(player);
    }
}
