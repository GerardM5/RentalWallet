import React from "react";
import "./Nav.css";

import logo from "src/assets/logo/LargeLogo.png";
import { Link } from "react-router-dom";

export default function Nav() {
  return (
    <nav className="container">
      <div className="LogoContainer">
        <img src={logo} alt="Logo" className="LogoImage" />
      </div>
      <div>
        <Link to="/profile">
          <img
            src="https://api.multiavatar.com/Starcrasher.svg
"
            alt="Profile"
            className="ProfileImage"
          />
        </Link>
      </div>
    </nav>
  );
}
