import React from "react";

import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faDesktop, faFileCode } from "@fortawesome/free-solid-svg-icons";

const Services = () => {
  return (
    <div id="services" className="services">
      <h1 className="py-5">my services</h1>
      <div className="container">
        <div className="row">
          <div className="col-md-6">
            <div className="box">
              <div className="circle">
                <FontAwesomeIcon className="icon" icon={faDesktop} size="2x" />
              </div>
              <h3>Java Developer</h3>
              {/* <p>
                I approach each project individually and always focus on the
                result.
              </p> */}
            </div>
          </div>
          {/* - */}
          <div className="col-md-6">
            <div className="box">
              <div className="circle">
                <FontAwesomeIcon className="icon" icon={faFileCode} size="2x" />
              </div>
              <h3>Full Stack Web development</h3>
              {/* <p>
                Your website or applications will be build witn an new proven
                technologies.
              </p> */}
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Services;
