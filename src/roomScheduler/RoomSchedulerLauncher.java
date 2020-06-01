package roomScheduler;

import room.ComputerLab;

/**
 * This is main class RoomSchedulerLauncher
 * @author Pham Thanh Hue
 * @version 1.0
 * Date: March 26, 2020
 */
public class RoomSchedulerLauncher {

    /**
     * This is main method to launch program
     *
     * @param args - This argument that passes to the Java compile
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RoomScheduler(new ComputerLab("B119")).launch();
            }
        });
    }
}
