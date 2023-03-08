import React from "react";
import author from "../lidija.jpg";

const AboutMe = () => {
  return (
    <div id="about" className="container py-5">
      <div className="row">
        <div className="col-lg-6 col-xm-12">
          <div className="photo-wrap mb-5">
            <img className="profile-img" src={author} alt="author..." />
          </div>
        </div>
        <div className="col-lg-6 col-xm-12">
          <h1 className="about-heading">about me</h1>
          <p>
            {" "}
            Hi, I'm Lidija. An experienced journalist turned software developer
            who can build applications from the ground up using an array of
            technologies. Tuned to the business needs to deliver high quality
            applications using Agile methodology. <br></br>Java, SQL, HTML,
            CSS/SASS, React, Bootstrap, jQuery, JSON, GitHub, JavaScript, Node,
            MySQL, Express, Agile Development, Document Object Model (DOM),
            APIs, Web APIs, MongoDB
          </p>
        </div>
      </div>
    </div>
  );
};

export default AboutMe;
