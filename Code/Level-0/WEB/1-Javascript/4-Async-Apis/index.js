/*

    how to implemet async execution in javascript lang ?

    2 ways

    1. Promise Api

        limitations with Promise Api,

            => can resolve/reject one item
            => hard to compose sequence multiple async operations 

    2. Reactive Programming 

        what is reactive means ?
            => responding to change / event

        how to implement ?
        => using 'Observable' streams

        i.e

        publisher , emit any change/message/event into stream
        subscriber, react to the change with stream


        spec,

        - Reactive rXtensions  ( Rx )


           implementation:
           
            - RxJS ( javascript implementation ) 


  -------------------------------------------------------------------



*/

const Rx = require('rxjs')
const { filter, bufferCount } = require('rxjs/operators')

//------------------------------------------------
// publisher / producer / dependency
//------------------------------------------------

const trainer = {
  getTopic() {
    // 2s
    let topic = 'topic-1'
    return topic
  },
  getTopicAsync() {
    const promise = new Promise((resolve, reject) => {
      setTimeout(() => {
        let topic = 'topic-1'
        console.log('trainer resolving promise..')
        resolve(topic)
      }, 5000)
    })
    return promise
  },
  getTopicsAsync() {
    const stream = new Rx.Subject() // Observable stream

    let i = 0
    let intervaId = setInterval(() => {
      i++
      console.log('TRAINER => propagating event/change/message')
      stream.next(i)

      //   if (i === 7) {
      //     stream.error(new Error('power outage'))
      //     clearInterval(intervaId)
      //   }

      if (i === 10) {
        stream.complete()
        clearInterval(intervaId)
      }
    }, 1000)

    return stream
  },
}

//------------------------------------------------
// subscriber / consumer / dependent
//------------------------------------------------

const employee = {
  doLearnAndWork() {
    // const topic = trainer.getTopic() // sync-call / pull-data / blocking-call
    // console.log('learning topic :  ' + topic + ' and working..')

    // const promise = trainer.getTopicAsync() // async-call / push-data / non-blocking call
    // promise.then((topic) => {
    //   console.log('learning topic :  ' + topic + ' and working..')
    // })

    const stream = trainer.getTopicsAsync()

    stream
      .pipe(filter((i) => i % 2 === 0))
      .pipe(bufferCount(2))
      .subscribe({
        next: (nextTopic) =>
          console.log(
            'EMP => learning topic :  ' + nextTopic + ' and working..',
          ),
        error: (error) => {
          console.log("Ok trainer, without practice, we'll leave meet " + error)
        },
        complete: () => {
          console.log('EMP => Thanks for all topics')
        },
      })

    console.log('can cont.. if any work..')
  },
}

employee.doLearnAndWork()
