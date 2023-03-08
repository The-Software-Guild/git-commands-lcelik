import React from "react";
import dadJokes from "../dadJokes.PNG";
import eventKeyCode from "../eventKeyCode.PNG";
import expandingCards from "../expandingCards.PNG";
import fAQCollapse from "../fAQCollapse.PNG";
import rotatingNavigation from "../rotatingNavigation.PNG";
import scoreKeeper from "../scoreKeeper.PNG";
import MetroSystem from "../MetroSystem.PNG";
import bankapp from "../bankapp.PNG";
import blog from "../blog.PNG";

//FONT AWESOME IMPORTS
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearchPlus } from "@fortawesome/free-solid-svg-icons";

//REACT POPUPBOX
import { PopupboxManager, PopupboxContainer } from "react-popupbox";
import "react-popupbox/dist/react-popupbox.css";

const Portfolio = () => {
  //DadJokes
  const openPopupboxdadJokes = () => {
    const content = (
      <>
        <img
          className="portfolio-image-popupbox"
          src={dadJokes}
          alt="Dad Jokes Project"
        />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() => window.open("https://github.com/lcelik/DadJokes")}
        >
          https://github.com/lcelik/DadJokes
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "Dad Jokes Project",
        },
      },
    });
  };

  const popupboxConfigdadJokes = {
    titleBar: {
      enable: true,
      text: "Dad Jokes Project.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //Event Key Code
  const openPopupboxeventKeyCode = () => {
    const content = (
      <>
        <img
          className="portfolio-image-popupbox"
          src={eventKeyCode}
          alt="Event Key Code"
        />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() => window.open("https://github.com/lcelik/EventKeyCode")}
        >
          https://github.com/lcelik/EventKeyCode
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "Event Key Code",
        },
      },
    });
  };

  const popupboxConfigeventKeyCode = {
    titleBar: {
      enable: true,
      text: "Event Key Code.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //Expanding Cards
  // const openPopupboxexpandingCards = () => {
  //   const content = (
  //     <>
  //       <img
  //         className="portfolio-image-popupbox"
  //         src={expandingCards}
  //         alt="Expanding Cards"
  //       />
  //       <b>GitHub: </b>{" "}
  //       <a
  //         className="hyper-link"
  //         onClick={() =>
  //           window.open("https://github.com/lcelik/ExpandingCards")
  //         }
  //       >
  //         https://github.com/lcelik/ExpandingCards
  //       </a>
  //     </>
  //   );

  //   PopupboxManager.open({ content });
  //   PopupboxManager.update({
  //     content,
  //     config: {
  //       titleBar: {
  //         text: "Expanding Cards",
  //       },
  //     },
  //   });
  // };

  // const popupboxConfigexpandingCards = {
  //   titleBar: {
  //     enable: true,
  //     text: "Expanding Cards.",
  //   },
  //   fadeIn: true,
  //   fadeInSpeed: 500,
  // };

  //FAQ Collapse
  // const openPopupboxfAQCollapse = () => {
  //   const content = (
  //     <>
  //       <img
  //         className="portfolio-image-popupbox"
  //         src={fAQCollapse}
  //         alt="FAQ Collapse"
  //       />
  //       <b>GitHub: </b>{" "}
  //       <a
  //         className="hyper-link"
  //         onClick={() =>
  //           window.open("https://github.com/lcelik/ExpandingCards")
  //         }
  //       >
  //         https://github.com/lcelik/ExpandingCards
  //       </a>
  //     </>
  //   );

  //   PopupboxManager.open({ content });
  //   PopupboxManager.update({
  //     content,
  //     config: {
  //       titleBar: {
  //         text: "FAQ Collapse",
  //       },
  //     },
  //   });
  // };

  // const popupboxConfigfAQCollapse = {
  //   titleBar: {
  //     enable: true,
  //     text: "FAQ Collapse.",
  //   },
  //   fadeIn: true,
  //   fadeInSpeed: 500,
  // };

  //Rotating Navigation
  const openPopupboxrotatingNavigation = () => {
    const content = (
      <>
        <img
          className="portfolio-image-popupbox"
          src={rotatingNavigation}
          alt="Rotating Navigation"
        />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() =>
            window.open("https://github.com/lcelik/RotatingNavigation")
          }
        >
          https://github.com/lcelik/RotatingNavigation
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "Rotating Navigation",
        },
      },
    });
  };

  const popupboxConfigrotatingNavigation = {
    titleBar: {
      enable: true,
      text: "Rotating Navigation.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //Score Keeper
  const openPopupboxscoreKeeper = () => {
    const content = (
      <>
        <img
          className="portfolio-image-popupbox"
          src={scoreKeeper}
          alt="Score Keeper"
        />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() => window.open("https://github.com/lcelik/ScoreKeeper")}
        >
          https://github.com/lcelik/ScoreKeeper
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "Score Keeper",
        },
      },
    });
  };

  const popupboxConfigscoreKeeper = {
    titleBar: {
      enable: true,
      text: "Score Keeper.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //Blog - Full Stack Web Development Porject

  const openPopupboxBlog = () => {
    const content = (
      <>
        <img className="portfolio-image-popupbox" src={blog} alt="Blog" />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() => window.open("https://github.com/lcelik/blog")}
        >
          https://github.com/lcelik/blog
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "Blog",
        },
      },
    });
  };

  const popupboxBlog = {
    titleBar: {
      enable: true,
      text: "Blog.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //MetroSystem Java

  const openPopupboxMetroSystem = () => {
    const content = (
      <>
        <img
          className="portfolio-image-popupbox"
          src={MetroSystem}
          alt="MetroSystem"
        />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() =>
            window.open(
              "https://github.com/lcelik/Metro-System---Final-Java-project"
            )
          }
        >
          https://github.com/lcelik/Metro-System---Final-Java-project
        </a>
        <b>Hosted on: </b>
        <a
          className="hyper-link"
          onClick={() => window.open("http://localhost:8086")}
        >
          http://localhost:8086
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "MetroSystem",
        },
      },
    });
  };

  const popupboxMetroSystem = {
    titleBar: {
      enable: true,
      text: "MetroSystem.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  //Bank App Java

  const openPopupboxBankApp = () => {
    const content = (
      <>
        <img className="portfolio-image-popupbox" src={bankapp} alt="BankApp" />
        <b>GitHub: </b>{" "}
        <a
          className="hyper-link"
          onClick={() =>
            window.open(
              "https://github.com/lcelik/JavaPractise/tree/main/Bank-App"
            )
          }
        >
          https://github.com/lcelik/JavaPractise/tree/main/Bank-App
        </a>
        <b>Hosted on: </b>
        <a
          className="hyper-link"
          onClick={() => window.open("http://localhost:8086")}
        >
          http://localhost:8089
        </a>
      </>
    );

    PopupboxManager.open({ content });
    PopupboxManager.update({
      content,
      config: {
        titleBar: {
          text: "BankApp",
        },
      },
    });
  };

  const popupboxBankApp = {
    titleBar: {
      enable: true,
      text: "BankApp.",
    },
    fadeIn: true,
    fadeInSpeed: 500,
  };

  return (
    <div id="portfolio" className="portfolio-wrapper">
      <div className="container">
        <h1 className="text-uppercase text-center py-5">portfolio</h1>

        <div className="image-box-wrapper row justify-content-center">
          <div className="portfolio-image-box" onClick={openPopupboxdadJokes}>
            <img
              className="portfolio-image"
              src={dadJokes}
              alt="Dad Jokes Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - Adding Blog - Full Stack Web Development Porject */}
          <div className="portfolio-image-box" onClick={openPopupboxBlog}>
            <img className="portfolio-image" src={blog} alt="Blog Project..." />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - */}

          {/* - Adding MetroSystem in Java */}
          <div
            className="portfolio-image-box"
            onClick={openPopupboxMetroSystem}
          >
            <img
              className="portfolio-image"
              src={MetroSystem}
              alt="Metro System Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - */}

          {/* - */}

          {/* - Adding Bank App in Java */}
          <div className="portfolio-image-box" onClick={openPopupboxBankApp}>
            <img
              className="portfolio-image"
              src={bankapp}
              alt="Bank App Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - */}

          {/* - */}

          <div
            className="portfolio-image-box"
            onClick={openPopupboxeventKeyCode}
          >
            <img
              className="portfolio-image"
              src={eventKeyCode}
              alt="Event Key Code Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - */}
          {/* <div
            className="portfolio-image-box"
            onClick={openPopupboxexpandingCards}
          >
            <img
              className="portfolio-image"
              src={expandingCards}
              alt="Expanding Cards Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div> */}

          {/* - */}
          {/* <div
            className="portfolio-image-box"
            onClick={openPopupboxfAQCollapse}
          >
            <img
              className="portfolio-image"
              src={fAQCollapse}
              alt="FAQ Collapse Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div> */}

          {/* - */}
          <div
            className="portfolio-image-box"
            onClick={openPopupboxrotatingNavigation}
          >
            <img
              className="portfolio-image"
              src={rotatingNavigation}
              alt="Rotating Navigation Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>

          {/* - */}
          <div
            className="portfolio-image-box"
            onClick={openPopupboxscoreKeeper}
          >
            <img
              className="portfolio-image"
              src={scoreKeeper}
              alt="Score Keeper Project..."
            />
            <div className="overflow"></div>
            <FontAwesomeIcon className="portfolio-icon" icon={faSearchPlus} />
          </div>
        </div>
      </div>

      <PopupboxContainer {...popupboxConfigdadJokes} />
      <PopupboxContainer {...popupboxConfigeventKeyCode} />
      {/* <PopupboxContainer {...popupboxConfigexpandingCards} /> */}
      {/* <PopupboxContainer {...popupboxConfigfAQCollapse} /> */}
      <PopupboxContainer {...popupboxBlog} />
      <PopupboxContainer {...popupboxConfigrotatingNavigation} />
      <PopupboxContainer {...popupboxConfigscoreKeeper} />
      <PopupboxContainer {...popupboxMetroSystem} />
      <PopupboxContainer {...popupboxBankApp} />
    </div>
  );
};

export default Portfolio;
