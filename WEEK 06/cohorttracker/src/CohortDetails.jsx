import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  // Check if status is "ongoing" (case-insensitive comparison)
  const isOngoing = cohort.status && cohort.status.toLowerCase() === 'ongoing';
  
  const h3Style = {
    color: isOngoing ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={h3Style}>{cohort.cohortCode || cohort.name}</h3>
      <dl>
        <dt>Status:</dt>
        <dd>{cohort.status}</dd>
        
        <dt>Start Date:</dt>
        <dd>{cohort.startDate}</dd>
        
        {cohort.coachName && (
          <>
            <dt>Coach:</dt>
            <dd>{cohort.coachName}</dd>
          </>
        )}
      </dl>
    </div>
  );
}

export default CohortDetails;