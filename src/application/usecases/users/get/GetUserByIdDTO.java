package application.usecases.users.get;

import java.util.Date;

public record GetUserByIdDTO(String id, String username, String prettyName, String email, Date birthDay) {}
