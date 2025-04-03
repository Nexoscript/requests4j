package com.nexoscript.requests4j;

import java.util.List;
import java.util.Map;

public record HttpResponse(int statusCode, String body, Map<String, List<String>> headers) {
}
