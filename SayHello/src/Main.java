import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        final PolitePerson jane = new PolitePerson("Jane");
        final PolitePerson john = new PolitePerson("John");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);
            }
        }).start();
    }

    static class PolitePerson {
        private final String name;
        static ReentrantLock lock = new ReentrantLock();

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void sayHello(PolitePerson person) {
            lock.lock();
            try {
                System.out.format("%s: %s" + " has said hello to me !%n", this.name, person.getName());
                person.sayHelloBack(this);
            } finally {
                lock.unlock();
            }
        }

        public void sayHelloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
