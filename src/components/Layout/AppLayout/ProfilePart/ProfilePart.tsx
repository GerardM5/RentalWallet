import React from "react";
import "./ProfilePart.css";
import { Link } from "react-router-dom";

export default function ProfilePart() {
  const loged = false;
  return (
    <div className="profilePartContainer">
      {loged ? (
        <>
          <div className="profilePartText">Tú nombre</div>
          <img
            src="https://api.multiavatar.com/pol.svg"
            alt="Avatar"
            className="profilePartAvatar"
          />
        </>
      ) : (
        <>
          <Link className="profilePartText" to="/login">
            Iniciar Sesion
          </Link>
        </>
      )}
    </div>
  );
}
