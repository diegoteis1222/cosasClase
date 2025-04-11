import java.util.ArrayList;

class Worker {
   protected String name;
   protected String lastName;
}


class Patient {
   public static int MAX_NUM_PATIENTS = 200;
   public String name;
   public String lastName;
   private ArrayList<String> knownAllergies = new ArrayList<String>();

   public ArrayList<String> getImportantAllergies() {
       // TODO filtrar alergias
       return knownAllergies;
   }
}


class Doctor extends Worker {
   private boolean hasMIR = true;
}


class OperatingRoom {
   public int floor;
   public int door;
   public boolean available;
}

/**
* Surgeon = Cirujano
*/
class Surgeon extends Doctor {
   public Nurse[] assistants = new Nurse[4];

   public void performSurgery(OperatingRoom room, Patient patient) {
       if (room != null && room.available == true) {
           // opero al paciente en el quirofano
       }
   }
}

class Pediatrician extends Doctor {

}

class Nurse extends Worker {
   public String field;

   public void takeTemperature(Patient patient) {
       // tomar temperatura
   }

   public void administerMedication(Patient patient) {
       // administro farmaco
   }

   public void treatWound(Patient patient) {
       // curo herida
   }
}

class Attendant extends Worker {
   public void movePatient(Patient patient) {
       // muevo paciente
   }
}


 class HealthCenter {
   public String name;
   private String location;
   public ArrayList<Worker> staff = new ArrayList<Worker>();
   public ArrayList<Patient> patients = new ArrayList<Patient>();

   public int getNumberOfWorkers() {
       return staff.size();
   }
}