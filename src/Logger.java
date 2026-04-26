abstract class Logger {
    protected Logger next;
    public void setNext(Logger next) { this.next = next; }
    public abstract void log(String message, int level);
}

class ErrorLogger extends Logger {
    public void log(String msg, int lvl) {
        if (lvl == 3) System.out.println("ERROR: " + msg);
        else if (next != null) next.log(msg, lvl);
    }
}
