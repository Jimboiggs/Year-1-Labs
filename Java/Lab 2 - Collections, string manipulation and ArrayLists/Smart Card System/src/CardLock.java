public class CardLock {
    private SmartCard lastCard;
    private boolean unlocked = false;
    private boolean studentAccess = false;

    public void swipeCard (SmartCard card) {
        lastCard = card;
        if (lastCard.isStaff() || studentAccess) {
            unlocked = true;
        }
    }
    public SmartCard getLastCardSeen() {
        return lastCard;
    }
    public boolean isUnlocked() {
        return unlocked;
    }
    public void toggleStudentAccess() {
        studentAccess = !studentAccess;
    }

}
