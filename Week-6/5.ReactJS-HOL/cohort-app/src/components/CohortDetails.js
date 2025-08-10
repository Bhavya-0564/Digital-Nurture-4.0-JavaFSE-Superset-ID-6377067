import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails() {
  const cohorts = [
    {
      title: "ADM21JF014 - Java FSD",
      startDate: "25-May-2021",
      endDate: "12-Sep-2021",
      status: "Ongoing",
      coach: "Veeramani",
      trainer: "Balaji"
    },
    {
      title: "CDBJF21025 - Java FSD",
      startDate: "20-Apr-2021",
      endDate: "30-Aug-2021",
      status: "Completed",
      coach: "Deepika",
      trainer: "Ramesh"
    },
    {
      title: "ADM21AF014 - .NET FSD",
      startDate: "15-Mar-2021",
      endDate: "01-Jul-2021",
      status: "Completed",
      coach: "Suresh",
      trainer: "Anita"
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <div key={index} className={styles.box}>
          <h3 className={cohort.status === "Ongoing" ? styles.ongoing : styles.default}>
            {cohort.title}
          </h3>
          <dl>
            <dt>Start Date:</dt>
            <dd>{cohort.startDate}</dd>

            <dt>End Date:</dt>
            <dd>{cohort.endDate}</dd>

            <dt>Status:</dt>
            <dd>{cohort.status}</dd>

            <dt>Coach:</dt>
            <dd>{cohort.coach}</dd>

            <dt>Trainer:</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
}

export default CohortDetails;
