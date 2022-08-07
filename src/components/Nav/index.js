import React from "react";
import "./Nav.css";
import LargeLogo from "components/Logos/LargeLogo";
export default function Nav() {
  return (
    <nav className="container">
      <LargeLogo />
      <div className="navSide">usuario</div>
    </nav>
  );
}
