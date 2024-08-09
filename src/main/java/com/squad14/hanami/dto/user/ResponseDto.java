package com.squad14.hanami.dto.user;

import java.util.UUID;

public record ResponseDto(UUID id, String name, String email, String token) {

}