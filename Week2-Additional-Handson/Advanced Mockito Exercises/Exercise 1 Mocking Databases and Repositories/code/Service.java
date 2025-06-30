package advancedMockitoexercise1;

//File name: CombinedExample.java

interface Repository {
 String getData();
}

class Service {
 private Repository repository;

 public Service(Repository repository) {
     this.repository = repository;
 }

 public String processData() {
     String data = repository.getData();
     return "Processed " + data;
 }
}
