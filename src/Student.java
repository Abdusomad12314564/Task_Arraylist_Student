
    public class Student {
        private String name;
        private byte age;
        private String group;

        public Student(String name, byte age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            this.age = age;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public void java() {
            if (group.contains("Java")) {
                System.out.println("Student name= " + name + ", age= " + age + ", group= " + group);
            }
        }
        public void js() {
            if (group.contains("JS")) {
                System.out.println("Student name= " + name + ", age= " + age + ", group= " + group);
            }
        }
        public void age() {
            if (age>=19 && age<=23) {
                System.out.println("Student name= " + name + ", age= " + age + ", group= " + group);
            }
        }
        public void aName() {
            if (name.contains("A")) {
                System.out.println("Student name= " + name + ", age= " + age + ", group= " + group);
            }
        }
        @Override
        public String toString() {
            return "Student name= " + name +
                    ", age= " + age +
                    ", group= " + group;
        }
    }


