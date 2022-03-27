package com.app.nsome.auth.service;

import com.app.nsome.auth.domain.Token;

public interface AuthService {
    public Token login();

    public void SendAuthEmail();

    public void SendAuthPone();
}
