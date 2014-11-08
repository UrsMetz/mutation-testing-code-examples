package mutation.testing.examples.dto.creator;

public class DtoCreator {
    public static Dto createDto(String firstName, String lastName) {
        Dto dto = new Dto();
        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        return dto;
    }
}
