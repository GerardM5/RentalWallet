import React from "react";
import "./AppLayout.css";
import ProfilePart from "./ProfilePart/ProfilePart";
import SearchPart from "./SearchPart/SearchPart";

interface AppLayoutProps {
  children?: React.ReactNode;
}
export default function AppLayout({ children }: AppLayoutProps) {
  return (
    <div className="container">
      <div className="content">
        <section className="leftSection">
          <img
            src={process.env.PUBLIC_URL + "images/LargeLogo.png"}
            width={250}
            alt="logo"
          />
        </section>
        <section className="rightSection">
          <nav className="navContainer">
            <div className="navRight">
              <SearchPart />
            </div>
            <div className="navLeft">
              <ProfilePart />
            </div>
          </nav>
          <main className="mainContainer">{children}</main>
        </section>
      </div>
    </div>
  );
}
