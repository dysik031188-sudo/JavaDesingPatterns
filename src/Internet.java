interface Internet { void connect(String url); }

class RealInternet implements Internet {
    public void connect(String url) { System.out.println("Соединение с " + url); }
}

class ProxyInternet implements Internet {
    private final RealInternet real = new RealInternet();

    @Override
    public void connect(String url) {
        if (url.contains("banned.com"))
            System.out.println("Доступ запрещен!");
     else  real.connect(url);
    }
}

